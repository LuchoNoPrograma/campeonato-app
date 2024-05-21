import {NgModule} from '@angular/core';

import {TablerIconsModule} from "angular-tabler-icons";
import * as TablerIcons from 'angular-tabler-icons/icons';


@NgModule({
  declarations: [],
  imports: [
    TablerIconsModule.pick(TablerIcons)
  ],
  exports: [
    TablerIconsModule
  ]
})
export class AppTablerIconsModule {
}
