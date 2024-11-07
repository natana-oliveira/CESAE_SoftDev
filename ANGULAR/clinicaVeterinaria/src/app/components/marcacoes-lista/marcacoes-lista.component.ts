import { Component } from '@angular/core';
import { Marcacao } from '../../models/marcacao';
import { HttpClientModule } from '@angular/common/http';
import { MarcacoesService } from '../../services/marcacoes.service';
import { Subscription } from 'rxjs';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-marcacoes-lista',
  standalone: true,
  imports: [HttpClientModule, RouterLink],
  providers: [MarcacoesService],
  templateUrl: './marcacoes-lista.component.html',
  styleUrl: './marcacoes-lista.component.scss'
})
export class MarcacoesListaComponent {

  marcacoes?: Marcacao[];

  marcacoesSubscription?: Subscription;

  constructor(private marcacoesService: MarcacoesService) {}

  ngOnInit() {
    this.marcacoesSubscription = this.marcacoesService.getAll().subscribe({
      next: (value) => {
        this.marcacoes = value;
      },
      error: (err) => {
        console.error('Erro ao carregar os dados!', err);
      },
    });
  }

  ngOnDestroy() {
    this.marcacoesSubscription?.unsubscribe();
  }

}
