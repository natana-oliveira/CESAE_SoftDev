import { Component } from '@angular/core';
import { MeuComponenteComponent } from '../meu-componente/meu-componente.component';

@Component({
  selector: 'app-primeira-pag',
  standalone: true,
  imports: [MeuComponenteComponent],
  templateUrl: './primeira-pag.component.html',
  styleUrl: './primeira-pag.component.scss'
})

export class PrimeiraPagComponent {
 
  meuNomePai: string = 'Oliveira';

  contadorPai: number = 0;

  atulizar(valor: number): void {
    this.contadorPai = valor;
  }

  changeMeuNomePai() {
    this.meuNomePai = 'Miguel';
  }
}


