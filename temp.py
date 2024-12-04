from flask import Flask, request, render_template_string

app = Flask(__name__)

# HTML form template
html_form = """
<!doctype html>
<html>
<head><title>Temperature Converter</title></head>
<body>
    <h2>Temperature Converter</h2>
    <form method="POST">
        <input type="number" step="any" name="temperature" placeholder="Enter temperature" required>
        <select name="conversion">
            <option value="c_to_f">Celsius to Fahrenheit</option>
            <option value="f_to_c">Fahrenheit to Celsius</option>
        </select>
        <button type="submit">Convert</button>
    </form>
    {% if result is not none %}
        <h3>Converted Temperature: {{ result }}</h3>
    {% endif %}
</body>
</html>
"""

@app.route("/", methods=["GET", "POST"])
def temperature_converter():
    result = None
    if request.method == "POST":
        temperature = float(request.form["temperature"])
        conversion = request.form["conversion"]

        if conversion == "c_to_f":
            result = (temperature * 9/5) + 32
        elif conversion == "f_to_c":
            result = (temperature - 32) * 5/9
    
    return render_template_string(html_form, result=result)

if __name__ == "__main__":
    app.run(debug=True)
