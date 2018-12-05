import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-requisicoes-http',
  templateUrl: './requisicoes-http.component.html',
  styleUrls: ['./requisicoes-http.component.css']
})
export class RequisicoesHttpComponent implements OnInit {

  constructor( private http: HttpClient) { }

  searchText = '';
  projects = [];

  ngOnInit() {
  }

  getProject(){
    if(this.searchText){
      const url = `https://api.github.com/search/repositories?q=${this.searchText}`;

      this.http.get(url)
      .subscribe(
        response => {
          this.projects = response['items'];
        }
      )
    }
  }

}
