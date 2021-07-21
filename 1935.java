    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> s = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            s.add(c);
        }
        int cnt = 0;
        outer:
        for (String word : text.split("\\s")) {
            for (char c : word.toCharArray()) {
                if (s.contains(c)) {
                    continue outer;
                }
            }
            ++cnt;
        }
        return cnt;
    }
