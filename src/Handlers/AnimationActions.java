package Handlers;

public class AnimationActions {

    public static Animation returnRightAnimation(Role role, Action action) {

        switch(action) {
            case WALK:
                switch (role) {
                    case VAGRANT:
                        return AnimationModels.VAGRANT_WALK;
                    case WARRIOR:
                        return AnimationModels.WARRIOR_WALK;
                    case ARCHER:
                        return AnimationModels.ARCHER_WALK;
                    case MAGICIAN:
                        return AnimationModels.MAGICIAN_WALK;
                    case CAT_GRAY:
                        return AnimationModels.CAT_WALK_GRAY;
                    case CAT_ORANGE:
                        return AnimationModels.CAT_WALK_ORANGE;
                    case CAT_BLACK:
                        return AnimationModels.CAT_WALK_BLACK;
                }
            case IDLE:
                switch (role) {
                    case VAGRANT:
                        return AnimationModels.VAGRANT_IDLE;
                    case WARRIOR:
                        return AnimationModels.WARRIOR_IDLE;
                    case ARCHER:
                        return AnimationModels.ARCHER_IDLE;
                    case MAGICIAN:
                        return AnimationModels.MAGICIAN_IDLE;
                    case CAT_GRAY:
                        return AnimationModels.CAT_IDLE_GRAY;
                    case CAT_ORANGE:
                        return AnimationModels.CAT_IDLE_ORANGE;
                    case CAT_BLACK:
                        return AnimationModels.CAT_IDLE_BLACK;
                }
            case JUMP:
                switch (role) {
                    case VAGRANT:
                        return AnimationModels.VAGRANT_JUMP;
                    case WARRIOR:
                        return AnimationModels.WARRIOR_JUMP;
                    case ARCHER:
                        return AnimationModels.ARCHER_JUMP;
                    case MAGICIAN:
                        return AnimationModels.MAGICIAN_JUMP;
                }
            case ATTACK:
                switch (role) {
                    case VAGRANT:
                        return AnimationModels.VAGRANT_ATTACK;
                    case WARRIOR:
                        return AnimationModels.WARRIOR_ATTACK;
                    case ARCHER:
                        return AnimationModels.ARCHER_ATTACK;
                    case MAGICIAN:
                        return AnimationModels.MAGICIAN_ATTACK;
                }
            case HIT:
                switch (role) {
                    case VAGRANT:
                        return AnimationModels.VAGRANT_HIT;
                    case WARRIOR:
                        return AnimationModels.WARRIOR_HIT;
                    case ARCHER:
                        return AnimationModels.ARCHER_HIT;
                    case MAGICIAN:
                        return AnimationModels.MAGICIAN_HIT;
                }
            case DEAD:
                switch (role) {
                    case VAGRANT:
                        return AnimationModels.VAGRANT_DEAD;
                    case WARRIOR:
                        return AnimationModels.WARRIOR_DEAD;
                    case ARCHER:
                        return AnimationModels.ARCHER_DEAD;
                    case MAGICIAN:
                        return AnimationModels.MAGICIAN_DEAD;
                }
            case OBJECT:
                switch (role) {
                    case VAGRANT:
                    case WARRIOR:
                        return null;
                    case ARCHER:
                        return AnimationModels.ARCHER_OBJECT;
                    case MAGICIAN:
                        return AnimationModels.MAGICIAN_OBJECT;
                }
        }
        return null;
    }
}