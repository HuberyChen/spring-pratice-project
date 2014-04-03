package spring.knights;

/**
 * @author hubery.chen
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        System.out.println(quest.embark());
    }
}
