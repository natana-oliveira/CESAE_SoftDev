import { Component } from '@angular/core';
import { MinhaListaItemComponent } from '../minha-lista-item/minha-lista-item.component';
import { CidadesService } from '../services/cidades-api.service';
import { ICidade } from '../models/cidade.model';
import { Router, RouterLink } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
 
@Component({
  selector: 'app-minha-lista',
  standalone: true,
  imports: [MinhaListaItemComponent, RouterLink, HttpClientModule],
  providers: [CidadesService],
  templateUrl: './minha-lista.component.html',
  styleUrl: './minha-lista.component.scss',
})
export class MinhaListaComponent {
  cidades: Array<ICidade> = [];
 
  constructor(private cidadesService: CidadesService, private router: Router) {
    console.log('MinhaListaComponent.constructor()');
    //...
  }
 
  ngOnChange() {
    /* É executado sempre que o Angular deteta
uma mudança em uma propriedade de entrada (@Input).
Recebe um objeto do tipo SimpleChanges que contém os
valores atuais e anteriores das propriedades alteradas */
   
    console.log('MinhaListaComponent.ngOnChange()');
  }
 
  ngOnInit() {
    /*É executado uma vez depois que o Angular
termina de inicializar as propriedades de entrada. É usado
para realizar operações de inicialização que dependem dos
dados de entrada, como fazer requisições HTTP, atribuir
valores a propriedades, etc…*/
 
    console.log('MinhaListaComponent.ngOnInit()');
   
    this.cidadesService.readAll().subscribe((cidades) => {
      this.cidades = cidades
    });
  }
 
  adicionarCidade(): void {
    this.cidadesService.create({id: '', nome: 'Lisboa', pais: 'Portugal'});
  }
 
  irAdicionarCidade(): void {
    this.router.navigate(['/formulario-cidade-td']);
    //this.router.navigateByUrl('/formulario-cidade-td');
  }
 
  limparDados(): void {
    this.cidadesService.limparDados();
    setTimeout(()=>{ // isto é para ser removido
      this.cidadesService.readAll().subscribe((cidades) => {
        console.log('aqui');
        this.cidades = cidades
      });
    }, 2000);
    //this.cidades = this.cidadesService.cidades;
  }
 
  ngDoCheck() {
    /* É executado a cada ciclo de deteção de
mudanças do Angular, que é o mecanismo que o Angular usa
para verificar se há mudanças nos dados e atualizar a view. É
usado para implementar uma lógica personalizada de
deteção de mudanças, que pode ser mais complexa ou
específica do que a padrão do Angular */
  }
 
  ngAfterContentChecked() {
    /* É executado depois de cada ciclo
de deteção de mudanças do Angular, depois que o conteúdo
projetado é verificado. É usado para realizar operações que
dependem das mudanças no conteúdo projetado, como
atualizar valores, aplicar estilos, etc… */
  }
 
  ngAfterViewInit() {
    /* É executado uma vez depois que o Angular
inicializa a view do e as views dos seus filhos. É usado para
realizar operações que dependem da view, como aceder
elementos DOM, manipular dados, etc… */
  }
 
  ngAfterViewChecked() {
    /* É executado depois de cada ciclo de
deteção de mudanças do Angular, depois que a view e as
views dos filhos são verificadas. É usado para realizar
operações que dependem das mudanças na view, como
atualizar valores, aplicar estilos, etc… */
  }
 
  ngOnDestroy() {
    /* É executado uma vez antes que o Angular
destrua o componente ou diretiva. É usado para realizar
operações de limpeza, como cancelar subscrições, desalocar
recursos, remover event listeners, etc… */
 
    console.log('MinhaListaComponent.ngOnDestroy()');
  }
}
 