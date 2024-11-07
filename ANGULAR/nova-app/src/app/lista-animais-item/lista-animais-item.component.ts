import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-lista-animais-item',
  standalone: true,
  imports: [],
  templateUrl: './lista-animais-item.component.html',
  styleUrl: './lista-animais-item.component.scss'
})
export class ListaAnimaisItemComponent {
  @Input({required: true}) animal: {nome: string, 
    especie: string, raca: string, idade: number} = {nome: '', especie: '',
    raca: '', idade: 0};
}
