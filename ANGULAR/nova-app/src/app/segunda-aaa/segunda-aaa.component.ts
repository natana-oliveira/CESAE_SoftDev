import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-segunda-aaa',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './segunda-aaa.component.html',
  styleUrl: './segunda-aaa.component.scss'
})
export class SegundaAaaComponent {
valor: number = -2;

fn(): void{
  if(this.valor >0) {
    // .....
  }
  else if (this.valor == 0) {
    // .....
  }
  else {
    // .....
  }
}

}
