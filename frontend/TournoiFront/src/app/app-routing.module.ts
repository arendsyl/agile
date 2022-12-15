import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateTournamentComponent } from './create-tournament/create-tournament.component';
import { GererMatchComponent } from './gerer-match/gerer-match.component';
import { GererTournoiComponent } from './gerer-tournoi/gerer-tournoi.component';

const routes: Routes = [
  {path: "", component: CreateTournamentComponent },
  {path: 'tournoi',component: CreateTournamentComponent },
  {path: 'tournoi/:idTournoi',component: GererTournoiComponent },
  {path: 'tournoi/:idTournoi/match/:idMatch',component: GererMatchComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {  }
