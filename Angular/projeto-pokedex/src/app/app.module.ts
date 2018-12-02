import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ListComponent } from './pokedex/list/list.component';
import { InformationComponent } from './pokedex/information/information.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    InformationComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
