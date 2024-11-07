import { Component, Input } from '@angular/core';
import { ICidade } from '../models/cidade.model';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-minha-lista-item',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './minha-lista-item.component.html',
  styleUrl: './minha-lista-item.component.scss',
})
export class MinhaListaItemComponent {
  @Input({ required: true }) cidade: ICidade = { id: 0, nome: '', pais: '', populacao: 0 };
}
