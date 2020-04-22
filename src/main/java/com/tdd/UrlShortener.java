/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd;

/**
 *
 * @author Farra
 */
public class UrlShortener {
    
    private CacheController cacheController;

    public UrlShortener() {
    }
    
   public String shorter(String uri){
       return cacheController.shortUrl(uri);
   }
   
   public String reverseUrl(String uri){
       return cacheController.reverseUrl(uri);
   }

    public CacheController getCacheController() {
        return cacheController;
    }

    public void setCacheController(CacheController cacheController) {
        this.cacheController = cacheController;
    }

}
