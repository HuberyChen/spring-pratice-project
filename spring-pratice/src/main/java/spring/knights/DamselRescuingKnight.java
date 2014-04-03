package spring.knights;

/**
 * @author hubery.chen
 */
public class DamselRescuingKnight implements Knight {
    private DamselRescuingQuest quest;

    public DamselRescuingKnight() {
        this.quest = new DamselRescuingQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
