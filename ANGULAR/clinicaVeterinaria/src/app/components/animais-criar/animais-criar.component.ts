import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { AnimaisService } from '../../services/animais.service';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
 
@Component({
  selector: 'app-animais-criar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [AnimaisService],
  templateUrl: './animais-criar.component.html',
  styleUrl: './animais-criar.component.scss'
})
export class AnimaisCriarComponent {
 
  formularioAnimal: FormGroup = new FormGroup({
    nome: new FormControl('', Validators.required),
    especie: new FormControl('', Validators.required),
    raca: new FormControl('', Validators.required),
    sexo: new FormControl('', Validators.required),
    dataNascimento: new FormControl('', Validators.required),
    tutorId: new FormControl('', Validators.required),
  });
  criarSubscription?: Subscription;
  submitted: boolean = false;
 
  constructor(
    private animaisService: AnimaisService,
    private router: Router
  ) {}
 
  handleSubmit(): void {
    this.submitted = true;
 
    if (this.formularioAnimal.valid) {
      this.criarSubscription = this.animaisService
        .create({
          nome: this.formularioAnimal.controls['nome'].value,
          especie: this.formularioAnimal.controls['especie'].value,
          raca: this.formularioAnimal.controls['raca'].value,
          sexo: this.formularioAnimal.controls['sexo'].value,
          dataNascimento: this.formularioAnimal.controls['dataNascimento'].value,
          tutorId: this.formularioAnimal.controls['tutorId'].value,
         
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
 