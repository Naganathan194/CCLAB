from flask import Flask, request, render_template_string

app = Flask(__name__)

# HTML form template
html_form = """
<!doctype html>
<html>
<head><title>CGPA Calculator</title></head>
<body>
    <h2>CGPA Calculator</h2>
    <form method="POST">
        <h3>Enter your grades and credits:</h3>
        <div id="input-fields">
            <input type="text" name="grade[]" placeholder="Grade (e.g., 9)" required>
            <input type="text" name="credit[]" placeholder="Credits (e.g., 3)" required><br>
        </div>
        <button type="button" onclick="addFields()">Add More</button><br><br>
        <button type="submit">Calculate CGPA</button>
    </form>
    <script>
        function addFields() {
            const div = document.createElement('div');
            div.innerHTML = '<input type="text" name="grade[]" placeholder="Grade" required> <input type="text" name="credit[]" placeholder="Credits" required><br>';
            document.getElementById('input-fields').appendChild(div);
        }
    </script>
    {% if result is not none %}
        <h3>Your CGPA: {{ result }}</h3>
    {% endif %}
</body>
</html>
"""

@app.route("/", methods=["GET", "POST"])
def cgpa_calculator():
    result = None
    if request.method == "POST":
        grades = request.form.getlist("grade[]")
        credits = request.form.getlist("credit[]")
        total_credits = 0
        weighted_sum = 0
        
        for grade, credit in zip(grades, credits):
            grade = float(grade)
            credit = float(credit)
            total_credits += credit
            weighted_sum += grade * credit
        
        if total_credits > 0:
            result = weighted_sum / total_credits
    
    return render_template_string(html_form, result=result)

if __name__ == "__main__":
    app.run(debug=True)
