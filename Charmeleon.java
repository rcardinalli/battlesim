
/**
 * Charmeleon Pokemon object class. 
 * Subclass of Charmander.
 * Parent class to Charizard.
 * 
 * @author Bob Cardinalli from:
 * @author Lisa Miller
 * @since 04 Feb 18
 * 
 */

public class Charmeleon extends Charmander {

	/** The minimum attack power for species. */
	static final int BASE_ATTACK_POWER = 158;
	/** The minimum defense power for species. */
	static final int BASE_DEFENSE_POWER = 129;
	/** The minimum stamina power for species. */
	static final int BASE_STAMINA_POWER = 116;

	/**
	 * Constructor with no name. uses Pokemon superclass constructor attacks
	 * must be set after contruction of Pokemon Object because of dependence on
	 * type interface
	 */
	public Charmeleon() {
		super("Charmeleon", "Charmeleon", 5, 1.1, 19.0, "", BASE_ATTACK_POWER,
				BASE_DEFENSE_POWER, BASE_STAMINA_POWER);

		chooseFastAttack();
		chooseSpecialAttack();
	}

	/**
	 * Constructor with name. uses Pokemon superclass constructor attacks must
	 * be set after contruction of Pokemon Object because of dependence on type
	 * interface
	 * 
	 * @param name The user-defined name.
	 */
	public Charmeleon(String name) {
		super("Charmeleon", name, 5, 1.1, 19.0, "", BASE_ATTACK_POWER,
				BASE_DEFENSE_POWER, BASE_STAMINA_POWER);

		chooseFastAttack();
		chooseSpecialAttack();
	}

	/**
	 * Constructor with species and name for subclasses.
	 * 
	 * @param species The Pokemon's species.
	 * @param name The optional user-given name.
	 * @param num The Pokedex number for this species.
	 * @param ht The height of this Pokemon.
	 * @param wt The weight of this Pokemon.
	 * @param type2 The Pokemon's second type.
	 * @param baseAttackPwr The low limit of Attack Power for species.
	 * @param baseDefensePwr The low limit of Defense Power for species.
	 * @param baseStaminaPwr The low limit of Stamina Power for species.
	 */
	protected Charmeleon(String species, String name, int num, double ht,
			double wt, String type2, int baseAttackPwr, int baseDefensePwr,
			int baseStaminaPwr) {

		super(species, name, num, ht, wt, type2, baseAttackPwr, baseDefensePwr,
				baseStaminaPwr);
	}

} // end of class
