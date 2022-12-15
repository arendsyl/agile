import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Tournoi } from '../modele/tournoi';

@Component({
  selector: 'app-create-tournament',
  templateUrl: './create-tournament.component.html',
  styleUrls: ['./create-tournament.component.css']
})
export class CreateTournamentComponent {
  tournoi: Tournoi;

  constructor() {
    this.tournoi = {nom:"", description:"", dateDebut:"", dateFin:"",nombreDePlace:0, estGratuit:false, organisateur:[""]};
  }

  submitNewTournois() {

  }

  ngOnInit(): void {
    
  }
}
