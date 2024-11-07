import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-segunda-bbb',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './segunda-bbb.component.html',
  styleUrl: './segunda-bbb.component.scss'
})
export class SegundaBbbComponent { 
  arr: Array <string> = [
    "João",
    "Natana",
    "Átylla",
    "Joana",
    "Ricardo"
  ]
}
