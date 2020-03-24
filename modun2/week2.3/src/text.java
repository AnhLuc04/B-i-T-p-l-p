//public class text {
    public class text {

        private long startTimestamp;
        private long totalTime = 0;
        private boolean isRunning = false;

        public text() {
            start();
        }

        public void start() {
            if (isRunning) return;
            startTimestamp = System.currentTimeMillis();
            isRunning = true;
        }

        public long stop() {
            if (isRunning) {
                updateTotalTime();
                isRunning = false;
            }
            return totalTime;
        }

        public void reset() {
            totalTime = 0;
            startTimestamp = System.currentTimeMillis();
        }

        public long split() {
            if (isRunning)
                updateTotalTime();
            return totalTime;
        }

        private void updateTotalTime() {
            long endTimestamp = System.currentTimeMillis();
            long elapsedTime = endTimestamp - startTimestamp;
            startTimestamp = endTimestamp;
            totalTime += elapsedTime;
        }

        public long getTime() {
            updateTotalTime();
            return totalTime;
        }

        public String getTimeString() {
            long totalTime = getTime();
            return getTimeString(totalTime);
        }

        public static String getTimeString(long timeMillis) {
            String totalTimeStr = timeMillis < 10000
                    ? timeMillis + " ms"
                    : (double) timeMillis / 1000.0 + " s";
            return totalTimeStr;
        }
    }
//}
