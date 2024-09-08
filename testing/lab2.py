def check_range(value, lower_bound=1, upper_bound=100):
    """Check if the value is within the given range."""
    return lower_bound <= value <= upper_bound

def run_tests():
    test_cases = [
        {"input": 50, "expected": True, "description": "Within valid range"},
        {"input": 1, "expected": True, "description": "Lower edge case"},
        {"input": 100, "expected": True, "description": "Upper edge case"},
        {"input": 0, "expected": False, "description": "Below valid range"},
        {"input": 101, "expected": False, "description": "Above valid range"},
        {"input": -10, "expected": False, "description": "Far below valid range"},
        {"input": 150, "expected": False, "description": "Far above valid range"},
        {"input": 2, "expected": True, "description": "Just above lower bound"},
        {"input": 99, "expected": True, "description": "Just below upper bound"},
        {"input": 100.5, "expected": False, "description": "Slightly above upper bound"},
        {"input": 1.5, "expected": True, "description": "Within valid range with float"},
        {"input": 0.999, "expected": False, "description": "Just below lower bound with float"},
        {"input": "50", "expected": False, "description": "String input"},
        {"input": None, "expected": False, "description": "None input"},
        {"input": [], "expected": False, "description": "List input"},
        {"input": 1000, "expected": False, "description": "Way above valid range"},
        {"input": -1000, "expected": False, "description": "Way below valid range"},
        {"input": 1e2, "expected": True, "description": "Scientific notation within range"},
        {"input": 1e3, "expected": False, "description": "Scientific notation above range"},
        {"input": 0.1, "expected": False, "description": "Small float below range"},
    ]
    
    for i, case in enumerate(test_cases, start=1):  
        try:
            result = check_range(case["input"])
            assert result == case["expected"], f"Test case {i} failed: {case['description']}"
            print(f"Test case {i} passed: {case['description']}")
        except Exception as e:
            print(f"Test case {i} raised an exception: {case['description']}, Exception: {e}")

if __name__ == "__main__":
    run_tests()
