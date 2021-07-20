    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> no = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            no.add(c);
        }
        int cnt = 0;
        outer:
        for (String word : text.split("\\s")) {
            for (char c : word.toCharArray()) {
                if (no.contains(c)) {
                    continue outer;
                }
            }
            ++cnt;
        }
        return cnt;
    }
