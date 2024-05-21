import {Routes} from '@angular/router';
import {FullLayoutComponent} from "./layout/full-layout/full-layout.component";

export const routes: Routes = [{
  path: '',
  component: FullLayoutComponent,
  children: [
    {
      path: '',
      loadComponent: () => import('./views/main/main.component').then(m => m.MainComponent)
    }
  ]
}];
