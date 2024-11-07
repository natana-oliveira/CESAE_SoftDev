import { Component } from '@angular/core';
import { Animais } from '../../models/animais';
import { HttpClientModule } from '@angular/common/http';
import { AnimaisService } from '../../services/animais.service';
import { Subscription } from 'rxjs/internal/Subscription';
import { RouterLink } from '@angular/router';
 
@Component({
  selector: 'app-animais-lista',
  standalone: true,
  imports: [HttpClientModule,RouterLink],
  providers: [AnimaisService],
  templateUrl: './animais-lista.component.html',
  styleUrl: './animais-lista.component.scss'
})
export class AnimaisListaComponent {
 
  animais?: Animais[];
  animaisSubscription?: Subscription;
 
  constructor(private animaisService: AnimaisService) {}
 
  ngOnInit() {
    this.animaisSubscription = this.animaisService.getAll().subscribe({
      next: (value) => {
        this.animais = value;
      },
      error: (err) => {
        console.error('Erro ao carregar os dados!', err);
      },
    });
  }
 
  ngOnDestroy() {
    this.animaisSubscription?.unsubscribe();
  }
 
 
}