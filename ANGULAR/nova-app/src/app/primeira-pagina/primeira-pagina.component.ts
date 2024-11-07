import { Component } from '@angular/core';
import { MeuComponenteComponent } from '../meu-componente/meu-componente.component';

@Component({
  selector: 'app-primeira-pagina',
  standalone: true,
  imports: [MeuComponenteComponent],
  templateUrl: './primeira-pagina.component.html',
  styleUrl: './primeira-pagina.component.scss',
})
export class PrimeiraPaginaComponent {
  meuNomePai: string = 'Teixeira';

  contadorPAI: number = 0;

  atualizar(valor: number): void {
    this.contadorPAI = valor;
  }
  
  changeMeuNomePai() {
    this.meuNomePai = 'Miguel';
  }
}
