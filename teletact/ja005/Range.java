package teletact.ja005;

public record Range(int start, int end){
    public Range{
        if (end <= start){
            throw new IllegalArgumentException();
        }
    }
}