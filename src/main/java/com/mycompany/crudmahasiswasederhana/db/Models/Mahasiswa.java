/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudmahasiswasederhana.db.Models;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
     private String nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(String nim, String nama, String alamat){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
 return alamat;
    }
    
    public void SetAlamat(String alamat){
        this.alamat = alamat;
    }
    }

