package disambiguation_of_functional_expressions.existing_issues.issues_with_resolving_overloaded_methods_passing_method_references;

class Championship {
    static boolean reward(Integer lapTime) {
        return(lapTime < 60);
    }
    static boolean reward(String lap) {
        return(lap.equalsIgnoreCase("final ");
    }
}