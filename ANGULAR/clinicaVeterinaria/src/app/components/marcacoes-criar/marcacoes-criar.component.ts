import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MarcacoesService } from '../../services/marcacoes.service';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-marcacoes-criar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [MarcacoesService],
  templateUrl: './marcacoes-criar.component.html',
  styleUrl: './marcacoes-criar.component.scss'
})
export class MarcacoesCriarComponent {
  formularioMarcacao: FormGroup = new FormGroup({
    tipo: new FormControl('', Validators.required),
    animalId: new FormControl('', Validators.required),
    tutorId: new FormControl('', Validators.required),
    dataHora: new FormControl('', Validators.required),
  });
  criarSubscription?: Subscription;
  submitted: boolean = false;

  constructor(
    private marcacoesService: MarcacoesService,
    private router: Router
  ) {}

  handleSubmit(): void {
    this.submitted = true;

    if (this.formularioMarcacao.valid) {
      this.criarSubscription = this.marcacoesService
        .create({
          tipo: this.formularioMarcacao.controls['tipo'].value,
          animalId: this.formularioMarcacao.controls['animalId'].value,
          tutorId: this.formularioMarcacao.controls['tutorId'].value,
          dataHora: this.formularioMarcacao.controls['dataHora']?.value,
        })
        .subscribe({
          next: (value) => {
            this.router.navigate(['/']);
          },
          error: (err) => {
            console.error('Erro ao criar uma nova marcação!', err);
          },
        });
    }
  }

  ngOnDestroy() {
    this.criarSubscription?.unsubscribe();
  }
}


