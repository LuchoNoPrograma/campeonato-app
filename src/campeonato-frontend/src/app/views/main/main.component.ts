import { Component } from '@angular/core';
import {MatCardModule} from "@angular/material/card";
import {MatButtonModule} from "@angular/material/button";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [MatCardModule, MatButtonModule],
  templateUrl: './main.component.html',
  styles: ``
})
export class MainComponent {
  contador: number = 0

  incrementar(){
    this.contador = this.contador + 1
  }
}
