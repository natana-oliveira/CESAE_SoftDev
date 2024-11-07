import { Component } from '@angular/core';
import { ListaAnimaisItemComponent } from '../lista-animais-item/lista-animais-item.component';

@Component({
  selector: 'app-lista-animais',
  standalone: true,
  imports: [ListaAnimaisItemComponent],
  templateUrl: './lista-animais.component.html',
  styleUrl: './lista-animais.component.scss'
})
export class ListaAnimaisComponent {

  animais: Array<{nome: string, especie: string, raca: string, idade: number}> = [
    {nome: 'Floco', especie: 'cão', raca: 'Husky siberiano', idade: 8},
    {nome: 'Salxixa', especie: 'cão', raca: 'Dachshund', idade: 5},
    {nome: 'Simba', especie: 'gato', raca: 'Siamês', idade: 3},
    {nome: 'Peg', especie: 'gato', raca: 'Sphynx', idade: 6},
    {nome: 'Luci', especie: 'pássaro', raca: 'Papagaio', idade: 4},
    {nome: 'Crude', especie: 'pássaro', raca: 'Calopsita', idade: 2},
  ];

}
