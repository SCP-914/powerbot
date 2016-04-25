package stumpy3toes.api.script;

import org.powerbot.script.Identifiable;
import org.powerbot.script.Nameable;
import org.powerbot.script.rt4.CacheItemConfig;
import org.powerbot.script.rt4.Interactive;
import stumpy3toes.api.script.ClientContext;

public abstract class GenericItem extends Interactive implements Identifiable, Nameable {
    public final ClientContext ctx;

    public GenericItem(final ClientContext ctx) {
        super(ctx);
        this.ctx = ctx;
    }

    @Override
    public String name() {
        return CacheItemConfig.load(id()).name;
    }

    public boolean members() {
        return CacheItemConfig.load(id()).members;
    }

    public boolean stackable() {
        return CacheItemConfig.load(id()).stackable;
    }

    public boolean noted() {
        return CacheItemConfig.load(id()).noted;
    }

    public boolean tradeable() {
        return CacheItemConfig.load(id()).tradeable;
    }

    public boolean cosmetic() {
        return CacheItemConfig.load(id()).cosmetic;
    }

    public int value() {
        return CacheItemConfig.load(id()).value;
    }

    public int modelId() {
        return CacheItemConfig.load(id()).modelId;
    }

    public String[] groundActions() {
        return CacheItemConfig.load(id()).groundActions;
    }

    public String[] inventoryActions() {
        return CacheItemConfig.load(id()).actions;
    }
}