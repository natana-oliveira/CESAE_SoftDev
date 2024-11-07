import { Component } from '@angular/core';
import { Marcacao } from '../../models/marcacao';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { MarcacoesService } from '../../services/marcacoes.service';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-marcacoes-eliminar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule, RouterLink],
  providers: [MarcacoesService],
  templateUrl: './marcacoes-eliminar.component.html',
  styleUrl: './marcacoes-eliminar.component.scss'
})
export class MarcacoesEliminarComponent {
 
  marcacao?: Marcacao;
 
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private marcacaoService: MarcacoesService
  ) {}
 
  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.marcacaoService.getById(id).subscribe(result => this.marcacao = result);
    }
  }
 
  cancelarEliminacao(): void {
    this.router.navigate(['']);
  }
 
  confirmarEliminacao(): void {
    if (this.marcacao) {
      this.marcacaoService.delete(this.marcacao).subscribe(() => {
        this.router.navigate(['']);
      });
    }
  }
 
}
