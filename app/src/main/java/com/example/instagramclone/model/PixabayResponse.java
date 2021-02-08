package com.example.instagramclone.model;

import java.util.List;

public class PixabayResponse {

    int totalHits ;
    int total;
    List<PixaBayPost> hits;

    public int getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<PixaBayPost> getHits() {
        return hits;
    }

    public void setHits(List<PixaBayPost> hits) {
        this.hits = hits;
    }
}
