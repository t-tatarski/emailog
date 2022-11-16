package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class SortIpAddr {

    private List<String> addrList;

    public SortIpAddr(List<String> addrList) {
        this.addrList = addrList;
    }

    public Map<String,Integer> sortedList (List<String> lista){
       // List<String> lista = new ArrayList<String>();

        Map<Integer,String> mapa = new HashMap<Integer,String>();
        Map<String, Integer> sortedMapa;
        Set<String> hashSet =new HashSet<>();

        for(int i=0;i<lista.size();i++){
            hashSet.add(lista.get(i));
            System.out.println(lista.get(i));
        }
        sortedMapa = hashSet.stream().collect(Collectors.toMap(x-> x, x -> 0));

        for(int j=0;j<hashSet.size();j++){

            for(int k=0;k<lista.size();k++){
                int tmpvl=sortedMapa.get(lista.get(k));

                if(hashSet.contains(lista.get(k))) {
                    tmpvl++;
                    sortedMapa.put(lista.get(k),tmpvl);
                }
            }
        }

        return sortedMapa;
    }


}

