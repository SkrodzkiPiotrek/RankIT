import { Component, OnInit } from '@angular/core';
import {Club} from "../club";
import {ActivatedRoute, Router} from "@angular/router";
import {ClubService} from "../club.service";

@Component({
  selector: 'app-club-addform',
  templateUrl: './club-addform.component.html',
  styleUrls: ['./club-addform.component.css']
})
export class ClubAddformComponent {

  club: Club;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private clubService: ClubService) {
    this.club = new Club();
  }

  onSubmit() {
    this.clubService.save(this.club).subscribe(result => this.gotoClubList());
  }

  gotoClubList() {
    this.router.navigate(['/clubs']);
  }
}

