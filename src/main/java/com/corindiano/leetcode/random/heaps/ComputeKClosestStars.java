package com.corindiano.leetcode.random.heaps;

import java.util.*;

class ComputeKClosestStars {
    static class Star implements Comparable<Star> {
        private double x, y, z;

        public Star(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distance() { return Math.sqrt(x * x + y * y + z * z); }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (obj == this) return true;
            if (!(obj instanceof Star)) return false;

            Star other = (Star) obj;

            if (this.x != other.x) return false;
            if (this.y != other.y) return false;
            if (this.z != other.z) return false;

            return true;
        }

        @Override
        public int compareTo(Star o) {
            return Double.compare(this.distance(), o.distance());
        }
    }

    static List<Star> findClosestKStars(int k, Iterator<Star> stars) {
        PriorityQueue<Star> pq = new PriorityQueue<>(k, Collections.reverseOrder());

        while (stars.hasNext()) {
            pq.offer(stars.next());

            if (pq.size() > k) pq.poll();
        }

        return new ArrayList<>(pq);
    }
}