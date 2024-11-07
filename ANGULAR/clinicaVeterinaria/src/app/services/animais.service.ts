import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Animais } from '../models/animais';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AnimaisService {

  
  animaisUrl:string= 'http://localhost:3000/animais';
  animais: Array<Animais> = [];

  constructor(private http: HttpClient) { }

  //crud
getAll(): Observable<Animais[]> {
  return this.http.get<Animais[]>(this.animaisUrl);
}

getById(id: string): Observable<Animais> { //como escreve a string em JavaScript
  return this.http.get<Animais>(`${this.animaisUrl}/${id}`);
}

create(marcacao: Animais): Observable<Animais> {
  return this.http.post<Animais>(this.animaisUrl, marcacao);
}

update(marcacao: Animais): Observable<Animais> {
  return this.http.put<Animais>(`${this.animaisUrl}/${marcacao.id}`, marcacao);
}

delete(marcacao: Animais): Observable<Animais> {
  return this.http.delete<Animais>(`${this.animaisUrl}/${marcacao.id}`);
}

}
