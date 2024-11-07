import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root',
})
export class CidadesService {
  cidades: Array<ICidade> = [];

  constructor() {
    console.log(
      'localStorage.getItem("cidades")',
      localStorage.getItem('cidades')
    );

    if (!localStorage.getItem('cidades')) {
      this.reporDados();
    } else {
      this.readAll();
    }
  }
  
  limparDados(): void {
    //localStorage.clear(); // todos os dados
    localStorage.removeItem('cidades');
    this.cidades = [];
    
    this.reporDados();
  }
  
  reporDados(): void {
    let cidades: Array<ICidade> = [
      { id: 1, nome: 'Porto', pais: 'Portugal', populacao: 78450 },
      { id: 4, nome: 'Paris', pais: 'França', populacao: 2148271 },
      { id: 5, nome: 'Berlim', pais: 'Alemanha', populacao: 3645000 },
      { id: 2, nome: 'Aveiro', pais: 'Portugal', populacao: 181494 },
      { id: 3, nome: 'Barcelona', pais: 'Espanha', populacao: 1620343 },
    ];
    
    this.cidades = cidades;
    
    localStorage.setItem('cidades', JSON.stringify(cidades));
  }

  //crud
  create(novaCidade: ICidade): void {
    /*let maxID: number = 0;
    for (const item of this.cidades) {
      if (maxID < item.id) {
        maxID = item.id;
      }
    }*/

    /*let maxID: number = 0;
    this.cidades.forEach((item) => {
      if (maxID < item.id) {
        maxID = item.id;
      }
    });*/

    /*const maxID: ICidade = this.cidades.reduce(
      function name(max: ICidade, item: ICidade): ICidade {
        if(max.id > item.id) {
          return max;
        }
        else{
          return item;
        }
      }
    );*/

    const maxID: ICidade = this.cidades.reduce(
      (max: ICidade, item: ICidade) => max.id > item.id ? max : item
    );
    
    novaCidade.id = maxID.id + 1;

    this.cidades.push(novaCidade);
    localStorage.setItem('cidades', JSON.stringify(this.cidades));

    console.log(this.cidades); // --
  }

  readAll(): void {
    let cidades: Array<ICidade> = JSON.parse(
      localStorage.getItem('cidades') || ''
    );

    this.cidades = cidades;
  }

  read(id: number): ICidade {
    return this.cidades.filter((x: ICidade) => x.id === id)[0];
  }

  update(cidade: ICidade): void {
    let index: number = this.cidades.findIndex((x: ICidade) => x.id === cidade.id);
    this.cidades[index] = cidade;
    
    localStorage.setItem('cidades', JSON.stringify(this.cidades));
  }

  delete(cidade: ICidade): void {
    /*
    
    ---- ¡ AQUI ! ----
    
    */
  }
}
