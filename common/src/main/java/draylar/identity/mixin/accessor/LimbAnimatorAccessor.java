package draylar.identity.mixin.accessor;

import net.minecraft.entity.LimbAnimator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LimbAnimator.class)
public interface LimbAnimatorAccessor {
	@Accessor
	void setPrevSpeed(float prevSpeed);

	@Accessor
	float getPrevSpeed();

	@Accessor
	void setPos(float pos);
}
