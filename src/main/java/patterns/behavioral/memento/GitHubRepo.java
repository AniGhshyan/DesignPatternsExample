package patterns.behavioral.memento;

public class GitHubRepo {

    private Save save;

    public void setSave(Save save) {
        this.save = save;
    }

    public Save getSave() {
        return save;
    }
}
