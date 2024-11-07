import { Component, EventEmitter, Input, OnChanges, Output, Signal, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-meu-componente',
  standalone: true,
  imports: [],
  templateUrl: './meu-componente.component.html',
  styleUrl: './meu-componente.component.scss',
})
export class MeuComponenteComponent implements OnChanges {
  //@Input({ required: true, alias: 'meu-nome' }) meuNome: string = 'João';
  //@Input({ alias: 'meu-nome' }) meuNome: string = 'João';
  @Input('meu-nome') meuNome: string = 'João';
  mensagem: string = 'Eu adoro gatos! 😀';
  imagem: string =
    'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500';

  @Output() mudancaContador: EventEmitter<number> = new EventEmitter<number>();
  contador: number = 0;

  imagens: string[] = [
    'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500',
    'https://t1.ea.ltmcdn.com/pt/posts/4/8/5/gato_fraco_o_que_fazer_24584_orig.jpg',
    'https://sadanduseless.b-cdn.net/wp-content/uploads/2021/02/cat-taxidermy14.jpg',
  ];

  /*arr: Array<string> = [
    'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500',
    'https://t1.ea.ltmcdn.com/pt/posts/4/8/5/gato_fraco_o_que_fazer_24584_orig.jpg',
    'https://sadanduseless.b-cdn.net/wp-content/uploads/2021/02/cat-taxidermy14.jpg'
  ]*/

  obj: { id: number; nome: string /*, fn?: Function*/ } = {
    id: 80,
    nome: 'joaoo',
    //fn: () => {}
  };

  pCorTexto: string = '#336699';
  pCorFundo: string = '#99ccff';
  pAlterarCores: boolean = true;

  ngOnChanges(changes: SimpleChanges) {
    console.log('MeuComponenteComponent.ngOnChanges()', changes);
    
    if(changes['meuNome']) {
      console.log('O meuNome foi alterado para ' + changes['meuNome'].currentValue);
    }
    
    if(changes['meuNome2']) {
      //...
    }
  }
  
  alterarImagem(): void {
    this.imagem = this.imagens[1];
  }

  alterarImagem2(): void {
    this.imagem = this.imagens[2];
  }

  alterarCores(): void {
    let auxCor: string = this.pCorTexto;
    this.pCorTexto = this.pCorFundo;
    this.pCorFundo = auxCor;
  }

  alterarAtivo(): void {
    this.pAlterarCores = false;
  }

  incrementar(): void {
    this.contador++;
    this.mudancaContador.emit(this.contador);
  }
}
