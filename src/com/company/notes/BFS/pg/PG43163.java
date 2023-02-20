package com.company.notes.BFS.pg;

import java.util.LinkedList;
import java.util.Queue;

public class PG43163 {
    static String[] WORDS;
    static boolean[] visited;

    public int solution(String begin, String target, String[] words) {
        WORDS = words;
        visited = new boolean[words.length];
        int answer = bfs(begin, target);
        return answer;
    }

    public int bfs(String begin, String target){
        Queue<Item> queue = new LinkedList<>();
        queue.offer(new Item(begin,0));

        while(!queue.isEmpty()){
            Item item = queue.poll();
            if(item.val.equals(target)) return item.depth;

            for(int i = 0; i<WORDS.length; i++){
                if(!visited[i]){
                    int changeCnt = 0;
                    for(int j=0; j<item.val.length(); j++){
                        if(item.val.charAt(j) != WORDS[i].charAt(j)) changeCnt++;
                    }
                    if(changeCnt==1){
                        visited[i] = true;
                        queue.offer(new Item(WORDS[i],item.depth+1));
                    }
                }
            }
        }
        return 0;
    }

    class Item{
        String val;
        int depth;

        public Item(String val, int depth){
            this.val = val;
            this.depth = depth;
        }
    }
}
