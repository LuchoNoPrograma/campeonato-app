import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {MatCardModule} from "@angular/material/card";
import {MainComponent} from "./views/main/main.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MatCardModule, MainComponent],
  templateUrl: './app.component.html',
  styles: [],
})
export class AppComponent {
  title = 'campeonato-frontend';
}
