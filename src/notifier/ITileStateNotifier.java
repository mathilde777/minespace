package src.notifier;

public interface ITileStateNotifier {
    void notifyOpened(int explosiveNeighbourCount);
    void notifyFlagged();
    void notifyUnflagged();
    void notifyExplode();
}
