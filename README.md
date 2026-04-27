# COMP-511 Java Final Study

Interactive Java study environment using Jupyter notebooks with the IJava kernel, running inside VS Code.

## Setup

**Requirements**
- Python 3.12+
- Java JDK 9+
- VS Code with the [Jupyter extension](https://marketplace.visualstudio.com/items?itemName=ms-toolsai.jupyter)

**Install dependencies**

```bash
python3 -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
```

**Install the Java kernel**

```bash
curl -L -o ijava-1.3.0.zip https://github.com/SpencerPark/IJava/releases/download/v1.3.0/ijava-1.3.0.zip
unzip ijava-1.3.0.zip -d ijava
cd ijava
python3 install.py --sys-prefix
```

## Usage

1. Activate the virtual environment:
   ```bash
   source .venv/bin/activate
   ```

2. Open any `.ipynb` file in VS Code and select the **Java** kernel from the kernel picker (top right).

   > **If the Java kernel doesn't appear automatically: ** run `jupyter notebook --no-browser` in the terminal, then in VS Code select **Existing Jupyter Server** and paste the `http://127.0.0.1:8888/?token=...` URL.

3. Select the **Java** kernel and start coding.

## IJava Notebook Pattern

IJava does not auto-run `main()`. Use this two-cell pattern:

**Cell 1 — Define the class:**
```java
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
```

**Cell 2 or below the class - Explicitly Execute it:**
```java
MyClass.main(null);
```

Alternatively, skip the class wrapper entirely and write logic directly in a cell:
```java
// No class needed — just run code directly
System.out.println("Hello!");
```

## Contents

| File / Folder | Description |
|---|---|
| `*.ipynb` | Java study notebooks |
| `Lecture*.pdf` | Course lecture slides |
| `MaxHeap/` | MaxHeap implementation |
| `20260422-AVL.txt` | AVL tree notes |
| `requirements.txt` | Python dependencies |