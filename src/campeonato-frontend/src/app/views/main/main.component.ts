import { Component } from '@angular/core';
import {MatCardModule} from "@angular/material/card";
import {MatButtonModule} from "@angular/material/button";
import {MatListModule} from "@angular/material/list";
import {MatSidenavModule} from "@angular/material/sidenav";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [MatCardModule, MatButtonModule, MatListModule],
  templateUrl: './main.component.html',
  styles: ``
})
export class MainComponent {
  contador: number = 0

  constructor(){
    console.log("Iniciando MainComponent");
  }

  incrementar(){
    this.contador = this.contador + 1
  }
}
