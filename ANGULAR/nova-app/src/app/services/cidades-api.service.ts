import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
 
@Injectable({
  providedIn: 'root',
})
export class CidadesService {
  cidades: Array<ICidade> = [];
 
  constructor(private http: HttpClient) {}
 
  limparDados(): void {
    console.log('limparDados()');
 
    // limpar dados do bd.json
 
    this.reporDados();
  }
 
  reporDados(): void {
    console.log('reporDados()');
 
    let cidades: Array<ICidade> = [
      { id: '', nome: 'Porto', pais: 'Portugal', populacao: 78450 },
      { id: '', nome: 'Paris', pais: 'França', populacao: 2148271 },
      { id: '', nome: 'Berlim', pais: 'Alemanha', populacao: 3645000 },
      { id: '', nome: 'Aveiro', pais: 'Portugal', populacao: 181494 },
      { id: '', nome: 'Barcelona', pais: 'Espanha', populacao: 1620343 },
    ];
 
    cidades.forEach((cidade) => {
      console.log('reporDados().forEach()');
 
      this.create(cidade).subscribe({
        next: (data) => {
          console.log('create cidade ok');
        },
        error: (error) => {
          console.error('create cidade error');
        },
      });
    });
  }
 
  //crud
  create(novaCidade: ICidade): Observable<any> {
    console.log('create()', novaCidade);
 
    return this.http.post(
      'http://localhost:3000/cidades/',
      novaCidade
    );
  }
 
  readAll(): Observable<any> {
    return this.http.get('http://localhost:3000/cidades/');
  }
 
  read(id: string): Observable<any> {
    return this.http.get('http://localhost:3000/cidades/' + id);
  }
 
  update(cidade: ICidade): Observable<any> {
    return this.http.put('http://localhost:3000/cidades/' + cidade.id, cidade)
  }
 
  delete(cidade: ICidade): Observable<any> {
    return this.http.delete('http://localhost:3000/cidades/' + cidade.id)
  }
}
 