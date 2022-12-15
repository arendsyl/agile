import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateTournamentComponent } from './create-tournament/create-tournament.component';
import { InscriptionTournoiComponent } from './inscription-tournoi/inscription-tournoi.component';
import { SaisirResultatMatchComponent } from './saisir-resultat-match/saisir-resultat-match.component';
import { GererMatchComponent } from './gerer-match/gerer-match.component';
import { GererTournoiComponent } from './gerer-tournoi/gerer-tournoi.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateTournamentComponent,
    InscriptionTournoiComponent,
    SaisirResultatMatchComponent,
    GererMatchComponent,
    GererTournoiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
