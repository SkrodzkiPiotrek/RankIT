import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Club} from "./club";

@Injectable()
export class ClubService {

  private clubsUrl: string;

  constructor(private http: HttpClient) {
    this.clubsUrl = 'http://localhost:8080/clubs';
  }

  public findAll(): Observable<Club[]> {
    return this.http.get<Club[]>(this.clubsUrl);
  }
  public save(club: Club) {
    return this.http.post<Club>(this.clubsUrl, club);
  }
}
