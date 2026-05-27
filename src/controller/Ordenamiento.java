package controller;

import models.Tournament;

public class Ordenamiento {
  public void SortByTotalStarterPointsFilaA(Tournament[] tournaments) {
    for (int i = 0; i < tournaments.length; i++) {
      boolean swap = false;
      for (int j = 0; j < tournaments.length - i - 1; i++) {
        if (tournaments[j].getTotalStarterPoints() > tournaments[j + 1].getTotalStarterPoints()) {
          Tournament aux = tournaments[j];
          tournaments[j] = tournaments[j + 1];
          tournaments[j + 1] = aux;
          swap = true;
        }
      }
      if (swap != true) {
        break;
      }
    }
  }

  /**
   * public int binarySearchByTotalStarterPointsFilaA(Tournament[] tournaments,
   * int totalStarterPoints){
   * int bajo = 0;
   * int alto = tournaments.length-1;
   * while(bajo>=alto){
   * int centro = (bajo+alto)/2;
   * if (tournaments[centro].equals(totalStarterPoints)){
   * return centro;
   * }
   * if (tournaments[centro].getTotalStarterPoints < totalStarterPoints)
   * bajo = centro +1;
   * else
   * alto = centro -1;
   * }
   * return -1;
   * }
   * 
   * public Tournament binarySearchByTotalStarterPointsFilaA(Tournament[]
   * tournaments, int totalStarterPoints){
   * int bajo = 0;
   * int alto = tournaments.length-1;
   * while(bajo>=alto){
   * int centro = (bajo+alto)/2;
   * if (tournaments[centro].equals(totalStarterPoints)){
   * Tournament aux = tournaments[centro];
   * return aux;
   * }
   * if (tournaments[centro] < totalStarterPoints)
   * bajo = centro +1;
   * else
   * alto = centro -1;
   * }
   * return -1;
   * }
   */
}
