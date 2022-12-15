import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateTournamentComponent } from './create-tournament/create-tournament.component';
import { GererMatchComponent } from './gerer-match/gerer-match.component';
import { GererTournoiComponent } from './gerer-tournoi/gerer-tournoi.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateTournamentComponent,
    GererMatchComponent,
    GererTournoiComponent,
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
