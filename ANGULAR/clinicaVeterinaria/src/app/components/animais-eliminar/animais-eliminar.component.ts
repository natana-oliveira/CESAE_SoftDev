import { Component } from '@angular/core';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { AnimaisService } from '../../services/animais.service';
import { Animais } from '../../models/animais';


@Component({
  selector: 'app-animais-eliminar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule, RouterLink],
  providers: [AnimaisService],
  templateUrl: './animais-eliminar.component.html',
  styleUrl: './animais-eliminar.component.scss'
})
export class AnimaisEliminarComponent {

  animal?: Animais;
 
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private animalService: AnimaisService
  ) {}
 
  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.animalService.getById(id).subscribe(result => this.animal = result);
    }
  }
 
  cancelarEliminacao(): void {
    this.router.navigate(['']);
  }
 
  confirmarEliminacao(): void {
    if (this.animal) {
      this.animalService.delete(this.animal).subscribe(() => {
        this.router.navigate(['']);
      });
    }
  }
 

}
