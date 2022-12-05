package com.company.notes.programmers;

import java.util.*;

public class Q42579 {
    public static void main(String[] args) {
        Q42579 test = new Q42579();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] result = test.solution(genres, plays);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<Music>> hash = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            ArrayList<Music> list = hash.getOrDefault(genres[i], new ArrayList<>());
            list.add(new Music(i, plays[i]));
            hash.put(genres[i], list);
        }

        ArrayList<Genres> genresList = new ArrayList<>();

        for (Map.Entry<String, ArrayList<Music>> entry : hash.entrySet()) {
            int sum = 0;
            for (Music music : entry.getValue()) {
                sum += music.plays;
            }
            genresList.add(new Genres(entry.getKey(), sum));
        }
        Collections.sort(genresList);
        ArrayList<Integer> answerArrList = new ArrayList<>();
        for (Genres g : genresList) {
            ArrayList<Music> list = hash.get(g.name);
            Collections.sort(list);
            if (list.size() < 2) {
                answerArrList.add(list.get(0).id);
            } else {
                for (int i = 0; i < 2; i++) {
                    answerArrList.add(list.get(i).id);
                }
            }

        }
        int[] answer = new int[answerArrList.size()];
        int size = 0;
        for (Integer value : answerArrList) {
            answer[size++] = value;
        }
        return answer;
    }
    class Music implements Comparable<Music> {
        int id;
        int plays;

        public Music(int id, int plays) {
            this.id = id;
            this.plays = plays;
        }

        @Override
        public int compareTo(Music m) {
            if (this.plays < m.plays) return 1;
            else if (this.plays > m.plays) return -1;
            else {
                if (this.id > m.id) return 1;
                else return -1;
            }
        }
    }

    class Genres implements Comparable<Genres> {
        String name;
        int totalPlays;

        public Genres(String name, int totalPlays) {
            this.name = name;
            this.totalPlays = totalPlays;
        }


        @Override
        public int compareTo(Genres g) {
            if (this.totalPlays < g.totalPlays) return 1;
            else return -1;
        }
    }

}
